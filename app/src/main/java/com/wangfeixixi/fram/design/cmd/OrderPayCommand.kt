package com.wangfeixixi.fram.design.cmd

class OrderPayCommand(val id: Long) : OrderCommand {
    override fun execute() = println("paying for order with id: $id")
}
