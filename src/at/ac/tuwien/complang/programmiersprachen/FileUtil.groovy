package at.ac.tuwien.complang.programmiersprachen

/**
 * 
 * @author bernd warmuth <bernd.warmuth@gmail.com>
 *
 */
class FileUtil {


	static void main(args) {
		println 'hello'
		
		//parsing testfile
		def records = new XmlSlurper().parse("./examplefile.xml")
	}
}
