/*
 * Copyright (c) 2014 Amahi
 *
 * This file is part of Amahi.
 *
 * Amahi is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Amahi is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Amahi. If not, see <http ://www.gnu.org/licenses/>.
 */

package org.amahi.anywhere.bus;

import org.amahi.anywhere.server.model.ServerFile;

import java.util.List;

public class ServerFilesMetadataLoadedEvent implements BusEvent
{
	private final List<ServerFile> files;

	public ServerFilesMetadataLoadedEvent(List<ServerFile> files) {
		this.files = files;
	}

	public List<ServerFile> getFiles() {
		return files;
	}
}
