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

import time
import sys

import pygame
import os
import optparse
from datetime import datetime
import math

class Graph:
    fontheight = 20
    # These four values sould go into the configuration file
    winheight = 800     # Window height at startup
    width = 700      # Window width at startup

    bgcolor = (255,255,255)          # Background color for the window

    color = [(255,0,0), (0,255,0), (0,0,255)]

    txtcolor = (255,0,0)

    t = 0

    prev_display_debug = None

    def __init__(self, size):
        pygame.init()
        
        self.previous_points = [0]*size

        self.font = pygame.font.Font(None, self.fontheight)

        self.screen = pygame.display.set_mode( (self.width, self.winheight), pygame.RESIZABLE )

        pygame.display.set_caption( "Plotter" )
        self.screen.fill( self.bgcolor )

        pygame.display.flip()

    def display_debug(self, dtext):
        text = self.font.render(dtext, 1, self.txtcolor)
        pos = text.get_rect(left=0, top=self.winheight -self.fontheight - 5)

        if self.prev_display_debug:
            self.screen.fill(self.bgcolor, self.prev_display_debug)

        self.screen.blit(text, pos)

        if self.prev_display_debug:
            pygame.display.update(self.prev_display_debug)
        else:
            pygame.display.update(pos)

        self.prev_display_debug = pos

    def plot_values(self, values):
        self.t += 1
        yoff = 0
        
        each_y = self.winheight/len(values)

        norms = [a * (each_y-5)/each_y for a in values]


        for i in xrange(len(values)):
            pygame.draw.aaline(self.screen, 
                               self.color[i%3],
                               (self.t-1, 
                                self.previous_points[i]+yoff), 
                               (self.t,
                                norms[i]+yoff), 
                               1)
            yoff += each_y

        rect = pygame.Rect(self.t-1, 0, 40, self.winheight)
        pygame.display.update(rect)

        if self.t >= 700:
            self.t = 0
            self.screen.fill( self.bgcolor )

        self.previous_points = norms

    # def plot_3(self, x, y, z):
    #     self.t += 1

    #     yoff = 0
    #     vals = (x,y,z)

    #     norms = [a * 250/255 for a in vals]

    #     pygame.draw.aaline(self.screen, self.color[0], (self.t-1, self.previous_points[0]+yoff), (self.t,norms[0]+yoff), 1)

    #     yoff = 250
    #     pygame.draw.aaline(self.screen, self.color[1], (self.t-1, self.previous_points[1]+yoff), (self.t, norms[1]+yoff), 1)

    #     yoff = 500
    #     pygame.draw.aaline(self.screen, self.color[2], (self.t-1, self.previous_points[2]+yoff), (self.t, norms[2]+yoff), 1)

    #     self.display_debug("X: %.3d  Y: %.3d  Z: %.3d" %vals)
    #     rect = pygame.Rect(self.t-1, 0, 40, self.winheight)
    #     pygame.display.update(rect)

    #     if self.t >= 700:
    #         self.t = 0
    #         self.screen.fill( self.bgcolor )

    #     self.previous_points = norms


def main():
    parser = optparse.OptionParser(
        usage='Usage: %prog [options]',
        description="Plotter !")
    
    parser.add_option("-f", "--freq",
                      help="Sampling frequency in ms (defaults: 10ms)",
                      default=10, type="int",
                      metavar="sampling_freq")

    parser.add_option("-v", "--verbose",
                      help="Be verbose and display lots of garbage",
                      action="store_true", default=False,
                      metavar="verbose")
    
    (options, args) = parser.parse_args(sys.argv[1:])
    sampling_freq = options.freq

    g = None
    while True:
        l = [int(x) for x in sys.stdin.readline().strip().split()]
        if g == None:
            g = Graph(len(l))
        g.plot_values(l)
        pygame.time.wait(sampling_freq)


if __name__ == '__main__':
    sys.exit(main())
