/**
 * mindc examples
 *
 * Copyright (C) 2010 STMicroelectronics
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307 USA
 *
 * Contact: mind@ow2.org
 *
 * Authors: Matthieu Leclercq
 */
#include <stdlib.h>

/* -----------------------------------------------------------------------------
 * Implementation of the allocator interface.
 * -------------------------------------------------------------------------- */

void *METH(allocator, alloc)(int size) {
  return malloc(size);
}

void METH(allocator, free)(void *addr) {
  free(addr);
}

