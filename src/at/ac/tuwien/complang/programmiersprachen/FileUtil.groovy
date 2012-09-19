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

	static void main(args) {
		println 'parsing script file'
		def records = new XmlSlurper().parse("./examplefile.xml")

		def factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI)
		def schema = factory.newSchema(new File("syntax.xsd"))
		def validator = schema.newValidator()
		println 'validating script file'
		validator.validate(new StreamSource(new File("examplefile.xml")))
	}
}
