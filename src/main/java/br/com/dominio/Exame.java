//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.08.08 às 09:50:42 PM BRT 
//


package br.com.dominio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de exame complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="exame">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="codigo" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="10"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="dados_adicionais">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="250"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="id_lis">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="250"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exame")
public class Exame {

    @XmlAttribute(name = "codigo", required = true)
    protected String codigo;
    @XmlAttribute(name = "dados_adicionais")
    protected String dadosAdicionais;
    @XmlAttribute(name = "id_lis")
    protected String idLis;

    /**
     * Obtém o valor da propriedade codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define o valor da propriedade codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtém o valor da propriedade dadosAdicionais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDadosAdicionais() {
        return dadosAdicionais;
    }

    /**
     * Define o valor da propriedade dadosAdicionais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDadosAdicionais(String value) {
        this.dadosAdicionais = value;
    }

    /**
     * Obtém o valor da propriedade idLis.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdLis() {
        return idLis;
    }

    /**
     * Define o valor da propriedade idLis.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdLis(String value) {
        this.idLis = value;
    }

}
