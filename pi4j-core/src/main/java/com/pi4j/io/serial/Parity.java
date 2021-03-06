package com.pi4j.io.serial;

/*
 * #%L
 * **********************************************************************
 * ORGANIZATION  :  Pi4J
 * PROJECT       :  Pi4J :: Java Library (Core)
 * FILENAME      :  Parity.java
 *
 * This file is part of the Pi4J project. More information about
 * this project can be found here:  http://www.pi4j.com/
 * **********************************************************************
 * %%
 * Copyright (C) 2012 - 2019 Pi4J
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 *
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */

public enum Parity {

    NONE(com.pi4j.jni.Serial.PARITY_NONE),
    ODD(com.pi4j.jni.Serial.PARITY_ODD),
    EVEN(com.pi4j.jni.Serial.PARITY_EVEN),

    // NOT ALL UNIX SYSTEM SUPPORT 'MARK' PARITY; THIS IS EXPERIMENTAL
    MARK(com.pi4j.jni.Serial.PARITY_MARK),

    //NOT ALL UNIX SYSTEM SUPPORT 'SPACE' PARITY; THIS IS EXPERIMENTAL
    SPACE(com.pi4j.jni.Serial.PARITY_SPACE);

    private int index = 0;

    private Parity(int index){
        this.index = index;
    }

    public int getIndex(){
        return this.index;
    }

    public static Parity getInstance(String parity) {
        return Parity.valueOf(parity.toUpperCase());
    }
}
