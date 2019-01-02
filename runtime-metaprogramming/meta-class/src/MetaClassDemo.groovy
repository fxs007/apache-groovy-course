// MetaClass Demo


//Expando e = new Expando()
//e.name = 'Dan'
//e.writeCode = { -> println "$name loves to write code..."}
//e.writeCode()

class Developer {
//every class object has a property named metaClass
//meteClass points to an Expando
}
// per instance
Developer dan = new Developer()
dan.metaClass.name = 'Dan'
dan.metaClass.writeCode = { -> println "$name loves to write code..."}
dan.writeCode()

// every instance
String.metaClass.shout = { -> toUpperCase() }
println "hello dan".shout()