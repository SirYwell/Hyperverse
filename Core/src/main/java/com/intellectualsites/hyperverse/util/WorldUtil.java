//
// Hyperverse - A Minecraft world management plugin
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program. If not, see <http://www.gnu.org/licenses/>.
//

package com.intellectualsites.hyperverse.util;

import org.jetbrains.annotations.NotNull;

import java.util.regex.Pattern;

/**
 * World utility methods
 */
public final class WorldUtil {

    private static final Pattern worldNamePattern = Pattern.compile("[A-Za-z\\-_0-9]{1,16}");

    private WorldUtil() {
    }

    /**
     * Check whether or not a world name is valid
     *
     * @param worldName World name
     * @return True if the world name is valid, false if not
     */
    public static boolean validateName(@NotNull final String worldName) {
        return worldNamePattern.matcher(worldName).matches();
    }

}
