package com.wangfeixixi.sample.design.cmd

class OrderPayCommand(val id: Long) : OrderCommand {
    override fun execute() = println("paying for order with id: $id")
}
