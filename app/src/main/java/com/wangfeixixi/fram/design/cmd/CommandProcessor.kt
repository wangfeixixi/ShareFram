package com.wangfeixixi.fram.design.cmd

class CommandProcessor {

    private val queue = ArrayList<OrderCommand>()

    fun addToQueue(orderCommand: OrderCommand): CommandProcessor
            = apply { queue.add(orderCommand) }

    fun processCommands(): CommandProcessor = apply {
        queue.forEach { it.execute() }
        queue.clear()
    }
}
