package first

class example5 {
	static void main(def args) {
		def list1 = [11, 2, 19, 5, "Mango", "Apple", "Watermelon"]
		def strlist = list1.minus([11, 2, 19, 5])
		def intlist = list1.minus(strlist)
		
		println "String list: ${strlist.sort()}"
		println "Integer list: ${intlist.sort()}"
	}
}
