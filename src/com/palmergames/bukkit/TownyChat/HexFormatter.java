package com.palmergames.bukkit.TownyChat;

import net.md_5.bungee.api.ChatColor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexFormatter {

    public static final Pattern hexPattern = Pattern.compile("(?<!\\\\)(#[a-fA-F0-9]{6})");

    public static String translateHexColors(String str) {
        Matcher hexMatcher = hexPattern.matcher(str);

        while (hexMatcher.find()) {
            String hex = hexMatcher.group();
            str = str.replace(hex, ChatColor.of(hex).toString());
        }

        return str;
    }

}
