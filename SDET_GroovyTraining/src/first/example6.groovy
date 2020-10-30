package first

class example6 {
	static void main(def args) {
		def map1 = [:]
		map1.put(1, "Cats")
		map1.put(2, "Dogs")
		map1.put(3, "Wolves")
		
		for(def pairs: map1) {
			println pairs
		}
		
		def map2 = map1.plus([4:"Donkeys", 5:"Horses"])
		println map2
		
		println map2.values().sort()
		println map2.values().sort({it.length()})
	}
}
