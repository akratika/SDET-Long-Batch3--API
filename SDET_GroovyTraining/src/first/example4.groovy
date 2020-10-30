package first

class example4 {
	static void main(def args) {
		def string = "This is a Groovy language"
		
		println "Reverse String: "+ string.reverse()
		println "SubString: "+ string.substring(10)
		println "Split String: "+string.split(" ")
		println  "Subtract from String: "+ string.minus("Groovy")
		println "LowerCase:" + string.toLowerCase()
		println "UpperCase:" + string.toUpperCase()
		
		//Regex Operations
		if(string.matches("(.*)Groovy(.*)")) {
			println "String matches"
		}
		println(string.replaceAll("Groovy", "very Groovy"))
		println string
	}
}
