/*
 * Copyright © 2020 FlashyReese
 *
 * This file is part of CommandAliases.
 *
 * Licensed under the MIT license. For more information,
 * see the LICENSE file.
 */

package me.flashyreese.mods.commandaliases.command;

/**
 * Represents the CommandAliases Command Type
 *
 * @author FlashyReese
 * @version 0.4.0
 * @since 0.3.0
 */
public enum CommandMode {
    COMMAND_ALIAS,
    COMMAND_CUSTOM,
    COMMAND_REASSIGN,
    COMMAND_REASSIGN_AND_ALIAS,
    COMMAND_REASSIGN_AND_CUSTOM,
    COMMAND_REDIRECT,
    COMMAND_REDIRECT_NOARG;
}
