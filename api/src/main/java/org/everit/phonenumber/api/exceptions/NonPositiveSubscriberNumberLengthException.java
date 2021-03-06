package org.everit.phonenumber.api.exceptions;

/*
 * Copyright (c) 2011, Everit Kft.
 *
 * All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */

/**
 * NonPositiveSubscriberNumberLengthException is throw when the subscriber number length is not positive.
 */
public class NonPositiveSubscriberNumberLengthException extends RuntimeException {

    /**
     * Generated serial version id.
     */
    private static final long serialVersionUID = -3478524020881270052L;

    /**
     * The default constructor with "The subscriber number length is not positive." error message.
     */
    public NonPositiveSubscriberNumberLengthException() {
        super("The subscriber number length is not positive.");
    }
}
