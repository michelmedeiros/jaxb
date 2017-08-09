//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.08.08 às 09:50:42 PM BRT 
//


package br.com.dominio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de solicitacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="solicitacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amostra" type="{}amostra" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="codigo_lis" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="30"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="codigo_paciente" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="crm">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="0"/>
 *             &lt;maxLength value="13"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="observacao">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="250"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="medicamentos">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="250"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="data">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="\d{2}[/]\d{2}[/]\d{4}"/>
 *             &lt;pattern value="[0-3][0-9]/[01][0-9]/[0-9]{4} [0-2][0-9]:[0-5][0-9]:[0-6][0-9]"/>
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
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solicitacao", propOrder = {
    "amostra"
})
public class Solicitacao {

    @XmlElement(required = true)
    protected List<Amostra> amostra;
    @XmlAttribute(name = "codigo_lis", required = true)
    protected String codigoLis;
    @XmlAttribute(name = "codigo_paciente", required = true)
    protected String codigoPaciente;
    @XmlAttribute(name = "crm")
    protected String crm;
    @XmlAttribute(name = "observacao")
    protected String observacao;
    @XmlAttribute(name = "medicamentos")
    protected String medicamentos;
    @XmlAttribute(name = "data")
    protected String data;
    @XmlAttribute(name = "dados_adicionais")
    protected String dadosAdicionais;

    /**
     * Gets the value of the amostra property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amostra property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmostra().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Amostra }
     * 
     * 
     */
    public List<Amostra> getAmostra() {
        if (amostra == null) {
            amostra = new ArrayList<Amostra>();
        }
        return this.amostra;
    }

    /**
     * Obtém o valor da propriedade codigoLis.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoLis() {
        return codigoLis;
    }

    /**
     * Define o valor da propriedade codigoLis.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoLis(String value) {
        this.codigoLis = value;
    }

    /**
     * Obtém o valor da propriedade codigoPaciente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPaciente() {
        return codigoPaciente;
    }

    /**
     * Define o valor da propriedade codigoPaciente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPaciente(String value) {
        this.codigoPaciente = value;
    }

    /**
     * Obtém o valor da propriedade crm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrm() {
        return crm;
    }

    /**
     * Define o valor da propriedade crm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrm(String value) {
        this.crm = value;
    }

    /**
     * Obtém o valor da propriedade observacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Define o valor da propriedade observacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
    }

    /**
     * Obtém o valor da propriedade medicamentos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicamentos() {
        return medicamentos;
    }

    /**
     * Define o valor da propriedade medicamentos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicamentos(String value) {
        this.medicamentos = value;
    }

    /**
     * Obtém o valor da propriedade data.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Define o valor da propriedade data.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
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

}
