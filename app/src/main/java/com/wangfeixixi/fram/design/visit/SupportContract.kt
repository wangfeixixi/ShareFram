package com.wangfeixixi.fram.design.visit

class SupportContract(val costPerMonth: Long) : ReportVisitable {
    override fun accept(visitor: ReportVisitor) = visitor.visit(this)
}