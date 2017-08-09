//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.08.08 às 09:50:42 PM BRT 
//


package br.com.dominio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.dominio package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Solicitacoes_QNAME = new QName("", "solicitacoes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.dominio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Solicitacoes }
     * 
     */
    public Solicitacoes createSolicitacoes() {
        return new Solicitacoes();
    }

    /**
     * Create an instance of {@link Entidade }
     * 
     */
    public Entidade createEntidade() {
        return new Entidade();
    }

    /**
     * Create an instance of {@link Solicitacao }
     * 
     */
    public Solicitacao createSolicitacao() {
        return new Solicitacao();
    }

    /**
     * Create an instance of {@link Exame }
     * 
     */
    public Exame createExame() {
        return new Exame();
    }

    /**
     * Create an instance of {@link Paciente }
     * 
     */
    public Paciente createPaciente() {
        return new Paciente();
    }

    /**
     * Create an instance of {@link Medico }
     * 
     */
    public Medico createMedico() {
        return new Medico();
    }

    /**
     * Create an instance of {@link Pacientes }
     * 
     */
    public Pacientes createPacientes() {
        return new Pacientes();
    }

    /**
     * Create an instance of {@link Medicos }
     * 
     */
    public Medicos createMedicos() {
        return new Medicos();
    }

    /**
     * Create an instance of {@link Amostra }
     * 
     */
    public Amostra createAmostra() {
        return new Amostra();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Solicitacoes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "solicitacoes")
    public JAXBElement<Solicitacoes> createSolicitacoes(Solicitacoes value) {
        return new JAXBElement<Solicitacoes>(_Solicitacoes_QNAME, Solicitacoes.class, null, value);
    }

}
