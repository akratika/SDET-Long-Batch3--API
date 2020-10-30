package first

class example7 {
	static void main(def args) {
		File file = new File("./src/sample.txt")
		file.createNewFile()
		
		file.write("A quick brown Fox jumped over the lazy Cow\nJohn Jimbo jingeled happily ever after\nTh1\$ 1\$ v3ry c0nfus1ng")
		file.eachLine { line-> println line }
		
def num = 10
println num.getClass().getName()
		
				
		//Print the line that ends with "Cow"
		file.eachLine { line->
			if(line ==~ /.*Cow$/) {
				println "Line that ends with Cow: $line"
			}
		}
		
		//Print the line that starts with "J"
		file.eachLine { line->
			if(line ==~ /^J.*/) {
				println "Line that starts with J: $line"
			}
		}
		
		//Print the line has two number one after the other
		file.eachLine { line->
			if(line ==~ /.*\d.*\d.*/) {
				println "Line that has two number one after the other: $line"
			}
		}
		
		//Print the string(s) that match the pattern '\S+er'
		/*file.eachLine { line->
			line ==~ /\S+er/
			println "Line that has string that match the pattern S+er: $line"
			}
		}*/
		file.eachLine { line->
			if(line ==~ /\S+er/) {
				println "Line that has string that match the pattern S+er: $line"
			}
		}
		
		//Print the string(s) that match the patter '\S*\d\W'
		file.eachLine { line->
			if(line =~ /\S*\d\W/) {
				println "Line that has string that match the pattern S,d,W: $line"
			}
		}
	}
}
