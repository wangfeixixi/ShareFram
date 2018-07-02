package com.wangfeixixi.fram.design.visit

class MonthlyCostReportVisitor(var monthlyCost: Long = 0) : ReportVisitor {
    override fun visit(contract: FixedPriceContract) {
        monthlyCost += contract.costPerYear / 12
    }

    override fun visit(contract: TimeAndMaterialsContract) {
        monthlyCost += contract.costPerHour * contract.hours
    }

    override fun visit(contract: SupportContract) {
        monthlyCost += contract.costPerMonth
    }
}