package com.wangfeixixi.fram.design.visit

class FixedPriceContract(val costPerYear: Long) : ReportVisitable {
    override fun accept(visitor: ReportVisitor) = visitor.visit(this)
}