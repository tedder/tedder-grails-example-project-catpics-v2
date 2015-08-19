// started from here: http://codenarc.sourceforge.net/StarterRuleSet-AllRulesByCategory.groovy.txt

ruleset {

    description '''
        A Sample Groovy RuleSet containing all CodeNarc Rules, grouped by category.
        You can use this as a template for your own custom RuleSet.
        Just delete the rules that you don't want to include.
        '''

    InsecureRandom(priority:1)
    SerializableClassMustDefineSerialVersionUID(priority:1)
    UnnecessaryCast(priority:1)
    UnnecessarySubstring(priority:2)
    UnnecessaryToString(priority:1)
    UnnecessaryTransientModifier(priority:1)
    MissingBlankLineAfterPackage(priority:1)
    SpaceAroundClosureArrow(priority:1)
    SpaceBeforeOpeningBrace(priority:1)

    // these might be arguably excluded
    ClassNameSameAsFilename(priority:1)
    ConfusingMethodName(priority:1)

    EnumCustomSerializationIgnored(priority:1)
}

