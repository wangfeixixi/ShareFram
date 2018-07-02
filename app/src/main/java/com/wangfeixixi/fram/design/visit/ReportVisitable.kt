package com.wangfeixixi.fram.design.visit

interface ReportVisitable {
    fun accept(visitor: ReportVisitor)
}

