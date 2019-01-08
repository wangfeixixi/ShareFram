package com.wangfeixixi.sample.design.visit

interface ReportVisitable {
    fun accept(visitor: ReportVisitor)
}

