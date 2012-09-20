package at.ac.tuwien.complang.programmiersprachen

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.SchemaFactory;

/**
 * 
 * @author bernd warmuth <bernd.warmuth@gmail.com>
 *
 */
class FileUtil {


	def visit(node) {
		node.childNodes().each { child ->

			if(child.name() == "call") {
				println ">> call ${child.text()}"
				def proc = ['bash','-c',child.text().trim()].execute()
				proc.waitFor()
			}
			visit(child)
		}
	}


	static void main(args) {

		def fileUtil = new FileUtil()
		println '>> parsing script file'
		def records = new XmlSlurper().parse("./helloworld.xml")

		def factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI)
		def schema = factory.newSchema(new File("syntax.xsd"))
		def validator = schema.newValidator()
		println '>> validating script file'
		validator.validate(new StreamSource(new File("helloworld.xml")))

		fileUtil.visit(records)

		println '>> exit'
	}
}
