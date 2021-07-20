package com.examples.abbasdgr8

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.subcommands

class Application : CliktCommand() {
    /**
     * Perform actions after parsing is complete and this command is invoked.
     *
     * This is called after command line parsing is complete. If this command is a subcommand, this will only
     * be called if the subcommand is invoked.
     *
     * If one of this command's subcommands is invoked, this is called before the subcommand's arguments are
     * parsed.
     */
    override fun run() = Unit
}

class Start: CliktCommand(help = "Start the application") {
    override fun run() {
        echo("Application started")
    }
}

class Stop: CliktCommand(help = "Stop the application") {
    override fun run() {
        echo("Application stopped")
    }
}

fun main(args: Array<String>) = Application().subcommands(Start(), Stop()).main(args)