package yetanotherx.bukkitplugin.ModTRS.validator;

import org.bukkit.command.CommandExecutor;

import yetanotherx.bukkitplugin.ModTRS.ModTRS;

public class EmptyValidator extends Validator {

    public EmptyValidator(CommandExecutor command, ModTRS parent) {
    }

    @Override
    public boolean isValid(String[] args) {

        //No validation needed

        return true;
    }
}
