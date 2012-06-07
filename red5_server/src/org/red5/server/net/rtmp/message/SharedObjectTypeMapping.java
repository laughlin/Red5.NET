package org.red5.server.net.rtmp.message;

/*
 * RED5 Open Source Flash Server - http://www.osflash.org/red5
 * 
 * Copyright (c) 2006-2009 by respective authors (see below). All rights reserved.
 * 
 * This library is free software; you can redistribute it and/or modify it under the 
 * terms of the GNU Lesser General Public License as published by the Free Software 
 * Foundation; either version 2.1 of the License, or (at your option) any later 
 * version. 
 * 
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY 
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A 
 * PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License along 
 * with this library; if not, write to the Free Software Foundation, Inc., 
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA 
 */

import org.red5.server.so.ISharedObjectEvent.Type;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * SO event types mapping
 */
public class SharedObjectTypeMapping {
    /**
     * Logger
     */
	protected static Logger log = LoggerFactory.getLogger(SharedObjectTypeMapping.class
			.getName());
    /**
     * Types map
     */
	public static final Type[] typeMap = new Type[] { null,
			Type.SERVER_CONNECT, // 01
			Type.SERVER_DISCONNECT, // 02
			Type.SERVER_SET_ATTRIBUTE, // 03
			Type.CLIENT_UPDATE_DATA, // 04 
			Type.CLIENT_UPDATE_ATTRIBUTE, // 05
			Type.SERVER_SEND_MESSAGE, // 06
			Type.CLIENT_STATUS, // 07
			Type.CLIENT_CLEAR_DATA, // 08
			Type.CLIENT_DELETE_DATA, // 09
			Type.SERVER_DELETE_ATTRIBUTE, // 0A
			Type.CLIENT_INITIAL_DATA, // 0B
	};

    /**
     * Convert byte value of RTMP marker to event type
     * @param rtmpType            RTMP marker value
     * @return                    Corresponding Shared Object event type
     */
    public static Type toType(byte rtmpType) {
		return typeMap[rtmpType];
	}

    /**
     * Convert SO event type to byte representation that RTMP uses
     * @param type                Event type
     * @return                    Byte representation of given event type
     */
    public static byte toByte(Type type) {
		//switch (type) {
			if (type == Type.SERVER_CONNECT) {
				return 0x01;
			} else if (type == Type.SERVER_DISCONNECT) {
				return 0x02;
			} else if (type == Type.SERVER_SET_ATTRIBUTE) {
				return 0x03;
    		} else if (type == Type.CLIENT_UPDATE_DATA) {
				return 0x04;
			} else if (type == Type.CLIENT_UPDATE_ATTRIBUTE) {
				return 0x05;
			} else if (type == Type.SERVER_SEND_MESSAGE) {
				return 0x06;
			} else if (type == Type.CLIENT_SEND_MESSAGE) {
				return 0x06;
			} else if (type == Type.CLIENT_STATUS) {
				return 0x07;
			} else if (type == Type.CLIENT_CLEAR_DATA) {
				return 0x08;
			} else if (type == Type.CLIENT_DELETE_DATA) {
				return 0x09;
			} else if (type == Type.SERVER_DELETE_ATTRIBUTE) {
				return 0x0A;
			} else if (type == Type.CLIENT_INITIAL_DATA) {
				return 0x0B;
			} else {
				log.error("Unknown type " + type);
				return 0x00;
			}
	}

    /**
     * String representation of type
     * @param type                Type
     * @return                    String representation of type
     */
    public static String toString(Type type) {
		//switch (type) {
    		if (type == Type.SERVER_CONNECT) {
    			return "server connect";
    		} else if (type == Type.SERVER_DISCONNECT) {
    			return "server disconnect";
    		} else if (type == Type.SERVER_SET_ATTRIBUTE) {
    			return "server_set_attribute";
    		} else if (type == Type.CLIENT_UPDATE_DATA) {
    			return "client_update_data";
    		} else if (type == Type.CLIENT_UPDATE_ATTRIBUTE) {
    			return "client_update_attribute";
    		} else if (type == Type.SERVER_SEND_MESSAGE) {
    			return "server_send_message";
    		} else if (type == Type.CLIENT_SEND_MESSAGE) {
    			return "client_send_message";
    		} else if (type == Type.CLIENT_STATUS) {
    			return "client_status";
    		} else if (type == Type.CLIENT_CLEAR_DATA) {
    			return "client_clear_data";
    		} else if (type == Type.CLIENT_DELETE_DATA) {
    			return "client_delete_data";
    		} else if (type == Type.SERVER_DELETE_ATTRIBUTE) {
    			return "server_delete_attribute";
    		} else if (type == Type.CLIENT_INITIAL_DATA) {
    			return "client_initial_data";
    		} else {
    			log.error("Unknown type " + type);
				return "unknown";
    		}
	}

}