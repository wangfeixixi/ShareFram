package com.wangfeixixi.fram.design.cmd

class OrderAddCommand(val id: Long) : OrderCommand {
    override fun execute() = println("adding order with id: $id")
}
