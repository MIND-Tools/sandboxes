#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Copyright (C) 2010 Verimag
#
#   This program is free software: you can redistribute it and/or modify
#   it under the terms of the GNU General Public License as published by
#   the Free Software Foundation, either version 3 of the License, or
#   (at your option) any later version.
#
#   This program is distributed in the hope that it will be useful,
#   but WITHOUT ANY WARRANTY; without even the implied warranty of
#   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
#   GNU General Public License for more details.
#
#   You should have received a copy of the GNU General Public License
#   along with this program.  If not, see <http://www.gnu.org/licenses/>.
#
# Author: Marc Poulhiès

import re
import sys
import optparse
import pprint
import pygame

import numpy.numarray
import matplotlib.pyplot as plt
import time


START = "FIFOTRACEBEGIN"
END = "FIFOTRACEEND"

FIFO_RE = re.compile("FIFOSIZETRACE (?P<fifo>\w+) (?P<size>\d+)")

MAX_VAL=200

parser = optparse.OptionParser(
    usage='Usage: %prog [options]',
    description="Plotter !")

parser.add_option("-m", "--max",
                  type="string")

parser.add_option("-f", "--freq",
                  help="Sampling frequency in ms (defaults: 10ms)",
                  default=10, type="int",
                  metavar="sampling_freq")

parser.add_option("-v", "--verbose",
                  help="Be verbose and display lots of garbage",
                  action="store_true", default=False,
                  metavar="verbose")
    
(options, args) = parser.parse_args(sys.argv[1:])
SAMPLING_FREQ = options.freq

max_vals = None

if options.max:
    max_vals = [int(x) for x in options.max.split(':')]

def get_fifo_size():
    v = {}
    line = sys.stdin.readline().strip()
    while line != START:
        line = sys.stdin.readline().strip()
    # begin found

    line = sys.stdin.readline().strip()
    while line != END:
        m = FIFO_RE.match(line)
        if m:
            v[m.group('fifo')] = int(m.group('size'))
        else:
            print "trash found"
            break
        line = sys.stdin.readline().strip()
    return v


first_block = get_fifo_size()


labels = first_block.keys()
data   = [first_block[x] for x in labels]

if max_vals and len(max_vals) != len(labels):
    print "max vals is not correct"
    sys.exit(-1)

if max_vals:
    data = [x*100/max_vals[i] for i,x in enumerate(data)]

FIG = plt.figure()

xlocations = numpy.numarray.array(range(len(data)))+0.5
width = 0.5
rects = plt.bar(xlocations, data, width=width)
plt.yticks(range(0, 100))
plt.xticks(xlocations+ width/2, labels)
plt.xlim(0, xlocations[-1]+width*2)
plt.title("FIFO SIZES")
plt.gca().get_xaxis().tick_bottom()
plt.gca().get_yaxis().tick_left()


def animate():
   
    while True:
        v = get_fifo_size()
        
        newvals = [v[x] for x in labels]
        
        if max_vals:
            newvals = [x*100/max_vals[i] for i,x in enumerate(newvals)]

        for i,rect in enumerate(rects):
            rect.set_height(newvals[i])

        FIG.canvas.draw()
        pygame.time.wait(SAMPLING_FREQ)
    raise SystemExit


import gobject
print 'adding idle'
gobject.idle_add(animate)
print 'showing'

plt.show()

