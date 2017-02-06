// option for anayzer: Cobertura, Clover, CloverBranch
job('example') {
    publishers {
        covcomplplot('Cobertura', false, false, true)
        //covcomplplot(analyzer, verbose , excludeGetterSetter, locateTopMost)
    }
}
