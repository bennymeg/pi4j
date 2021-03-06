package com.pi4j.component.gyroscope;

import java.io.IOException;

/*
 * #%L
 * **********************************************************************
 * ORGANIZATION  :  Pi4J
 * PROJECT       :  Pi4J :: Device Abstractions
 * FILENAME      :  Gyroscope.java
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

public interface Gyroscope {

    int READ_NOT_TRIGGERED = 0;
    int GET_ANGLE_TRIGGER_READ = 1;
    int GET_ANGULAR_VELOCITY_TRIGGER_READ = 2;
    int GET_RAW_VALUE_TRIGGER_READ = 4;

    float getAngularVelocity() throws IOException;

    void recalibrateOffset() throws IOException;

    void setReadTrigger(int readTrigger);

    void setRawValue(int value);
    int getRawValue() throws IOException;

    void setOffset(int offset);
    int getOffset();

    void setAngle(float angle);
    float getAngle() throws IOException;

}
