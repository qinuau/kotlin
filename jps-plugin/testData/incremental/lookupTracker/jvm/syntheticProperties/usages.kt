package foo.bar

/*p:<root>(JavaClass)*/import JavaClass
/*p:foo(KotlinClass)*/import foo.KotlinClass

/*p:foo.bar*/fun test() {
    val j = /*p:<root>*/JavaClass()
    val k = /*p:foo*/KotlinClass()

    /*p:<root>(JavaClass) p:kotlin(Int)*/j./*c:JavaClass*/getFoo()
    /*p:<root>(JavaClass)*/j./*c:JavaClass c:JavaClass(getSetFoo) c:JavaClass(getSETFoo) p:foo.bar p:foo.bar(invoke) p:kotlin p:kotlin.annotation p:kotlin.collections p:kotlin.ranges p:kotlin.sequences p:kotlin.text p:kotlin.io p:kotlin.comparisons p:java.lang p:kotlin.jvm p:kotlin(invoke) p:kotlin.annotation(invoke) p:kotlin.collections(invoke) p:kotlin.ranges(invoke) p:kotlin.sequences(invoke) p:kotlin.text(invoke) p:kotlin.io(invoke) p:kotlin.comparisons(invoke) p:java.lang(invoke) p:kotlin.jvm(invoke)*/setFoo(2)
    /*p:<root>(JavaClass) p:kotlin(Int)*/j./*c:JavaClass c:JavaClass(getFoo) c:JavaClass(getFOO) c:JavaClass(setFoo)*/foo = /*p:kotlin(Int)*/2
    /*p:<root>(JavaClass) p:kotlin(Int)*/j./*c:JavaClass c:JavaClass(getFoo) c:JavaClass(getFOO) c:JavaClass(setFoo)*/foo
    /*p:<root>(JavaClass) p:kotlin(String)*/j./*c:JavaClass c:JavaClass(getBar) c:JavaClass(getBAR) c:JavaClass(setBar)*/bar
    /*p:<root>(JavaClass) p:kotlin(String)*/j./*c:JavaClass c:JavaClass(getBar) c:JavaClass(getBAR) c:JavaClass(setBar)*/bar = /*p:kotlin(String)*/""
    /*p:<root>(JavaClass)*/j./*c:JavaClass c:JavaClass(getBazBaz) c:JavaClass(getBAZBaz) p:foo.bar p:foo.bar(invoke) p:kotlin p:kotlin.annotation p:kotlin.collections p:kotlin.ranges p:kotlin.sequences p:kotlin.text p:kotlin.io p:kotlin.comparisons p:java.lang p:kotlin.jvm p:kotlin(invoke) p:kotlin.annotation(invoke) p:kotlin.collections(invoke) p:kotlin.ranges(invoke) p:kotlin.sequences(invoke) p:kotlin.text(invoke) p:kotlin.io(invoke) p:kotlin.comparisons(invoke) p:java.lang(invoke) p:kotlin.jvm(invoke)*/bazBaz
    /*p:<root>(JavaClass)*/j./*c:JavaClass c:JavaClass(getBazBaz) c:JavaClass(getBAZBaz) p:foo.bar p:foo.bar(invoke) p:kotlin p:kotlin.annotation p:kotlin.collections p:kotlin.ranges p:kotlin.sequences p:kotlin.text p:kotlin.io p:kotlin.comparisons p:java.lang p:kotlin.jvm p:kotlin(invoke) p:kotlin.annotation(invoke) p:kotlin.collections(invoke) p:kotlin.ranges(invoke) p:kotlin.sequences(invoke) p:kotlin.text(invoke) p:kotlin.io(invoke) p:kotlin.comparisons(invoke) p:java.lang(invoke) p:kotlin.jvm(invoke)*/bazBaz = /*p:kotlin(String)*/""
    /*p:<root>(JavaClass)*/j./*c:JavaClass*/setBoo(2)
    /*p:<root>(JavaClass)*/j./*c:JavaClass c:JavaClass(getBoo) c:JavaClass(getBOO) p:foo.bar p:foo.bar(invoke) p:kotlin p:kotlin.annotation p:kotlin.collections p:kotlin.ranges p:kotlin.sequences p:kotlin.text p:kotlin.io p:kotlin.comparisons p:java.lang p:kotlin.jvm p:kotlin(invoke) p:kotlin.annotation(invoke) p:kotlin.collections(invoke) p:kotlin.ranges(invoke) p:kotlin.sequences(invoke) p:kotlin.text(invoke) p:kotlin.io(invoke) p:kotlin.comparisons(invoke) p:java.lang(invoke) p:kotlin.jvm(invoke)*/boo = /*p:kotlin(Int)*/2
    /*p:foo(KotlinClass) p:kotlin(Int)*/k./*c:foo.KotlinClass c:JavaClass*/getFoo() // getFoo may be an inner class in JavaClass
    /*p:foo(KotlinClass)*/k./*c:foo.KotlinClass c:JavaClass*/setFoo(2)
    /*p:foo(KotlinClass) p:kotlin(Int)*/k./*c:foo.KotlinClass c:foo.KotlinClass(getFoo) c:foo.KotlinClass(getFOO) c:foo.KotlinClass(setFoo)*/foo = /*p:kotlin(Int)*/2
    /*p:foo(KotlinClass) p:kotlin(Int)*/k./*c:foo.KotlinClass c:foo.KotlinClass(getFoo) c:foo.KotlinClass(getFOO) c:foo.KotlinClass(setFoo)*/foo
    /*p:foo(KotlinClass) p:kotlin(String)*/k./*c:foo.KotlinClass c:foo.KotlinClass(getBar) c:foo.KotlinClass(getBAR) c:foo.KotlinClass(setBar)*/bar
    /*p:foo(KotlinClass) p:kotlin(String)*/k./*c:foo.KotlinClass c:foo.KotlinClass(getBar) c:foo.KotlinClass(getBAR) c:foo.KotlinClass(setBar)*/bar = /*p:kotlin(String)*/""
    /*p:foo(KotlinClass)*/k./*c:foo.KotlinClass c:foo.KotlinClass(getBazBaz) c:foo.KotlinClass(getBAZBaz) p:foo.bar p:foo.bar(invoke) p:kotlin p:kotlin.annotation p:kotlin.collections p:kotlin.ranges p:kotlin.sequences p:kotlin.text p:kotlin.io p:kotlin.comparisons p:java.lang p:kotlin.jvm p:kotlin(invoke) p:kotlin.annotation(invoke) p:kotlin.collections(invoke) p:kotlin.ranges(invoke) p:kotlin.sequences(invoke) p:kotlin.text(invoke) p:kotlin.io(invoke) p:kotlin.comparisons(invoke) p:java.lang(invoke) p:kotlin.jvm(invoke) c:JavaClass*/bazBaz
    /*p:foo(KotlinClass)*/k./*c:foo.KotlinClass c:foo.KotlinClass(getBazBaz) c:foo.KotlinClass(getBAZBaz) p:foo.bar p:foo.bar(invoke) p:kotlin p:kotlin.annotation p:kotlin.collections p:kotlin.ranges p:kotlin.sequences p:kotlin.text p:kotlin.io p:kotlin.comparisons p:java.lang p:kotlin.jvm p:kotlin(invoke) p:kotlin.annotation(invoke) p:kotlin.collections(invoke) p:kotlin.ranges(invoke) p:kotlin.sequences(invoke) p:kotlin.text(invoke) p:kotlin.io(invoke) p:kotlin.comparisons(invoke) p:java.lang(invoke) p:kotlin.jvm(invoke) c:JavaClass*/bazBaz = /*p:kotlin(String)*/""
    /*p:foo(KotlinClass)*/k./*c:foo.KotlinClass c:JavaClass*/setBoo(2)
    /*p:foo(KotlinClass)*/k./*c:foo.KotlinClass c:foo.KotlinClass(getBoo) c:foo.KotlinClass(getBOO) p:foo.bar p:foo.bar(invoke) p:kotlin p:kotlin.annotation p:kotlin.collections p:kotlin.ranges p:kotlin.sequences p:kotlin.text p:kotlin.io p:kotlin.comparisons p:java.lang p:kotlin.jvm p:kotlin(invoke) p:kotlin.annotation(invoke) p:kotlin.collections(invoke) p:kotlin.ranges(invoke) p:kotlin.sequences(invoke) p:kotlin.text(invoke) p:kotlin.io(invoke) p:kotlin.comparisons(invoke) p:java.lang(invoke) p:kotlin.jvm(invoke) c:JavaClass*/boo = /*p:kotlin(Int)*/2
}
