package com.wangfeixixi.fram.design.visit

interface ReportVisitor {
    fun visit(contract: FixedPriceContract)
    fun visit(contract: TimeAndMaterialsContract)
    fun visit(contract: SupportContract)
}