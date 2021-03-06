/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.atom.domain.tables.records;


import cn.vertxup.atom.domain.tables.MAttribute;
import cn.vertxup.atom.domain.tables.interfaces.IMAttribute;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MAttributeRecord extends UpdatableRecordImpl<MAttributeRecord> implements IMAttribute {

    private static final long serialVersionUID = 949769322;

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.KEY</code>. 「key」- 属性ID
     */
    @Override
    public MAttributeRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.KEY</code>. 「key」- 属性ID
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.NAME</code>. 「name」- 属性名称
     */
    @Override
    public MAttributeRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.NAME</code>. 「name」- 属性名称
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.ALIAS</code>. 「alias」- 属性别名（业务名）
     */
    @Override
    public MAttributeRecord setAlias(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.ALIAS</code>. 「alias」- 属性别名（业务名）
     */
    @Override
    public String getAlias() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.TYPE</code>. 「type」- INTERNAL/EXTERNAL属性
     */
    @Override
    public MAttributeRecord setType(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.TYPE</code>. 「type」- INTERNAL/EXTERNAL属性
     */
    @Override
    public String getType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.SOURCE</code>. 「source」- 关联实体ID
     */
    @Override
    public MAttributeRecord setSource(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.SOURCE</code>. 「source」- 关联实体ID
     */
    @Override
    public String getSource() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.SOURCE_FIELD</code>. 「sourceField」- 可选，如果不设置则以name为主
     */
    @Override
    public MAttributeRecord setSourceField(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.SOURCE_FIELD</code>. 「sourceField」- 可选，如果不设置则以name为主
     */
    @Override
    public String getSourceField() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.EXPRESSION</code>. 「expression」- 表达式
     */
    @Override
    public MAttributeRecord setExpression(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.EXPRESSION</code>. 「expression」- 表达式
     */
    @Override
    public String getExpression() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.NORMALIZE</code>. 「normalize」- 表达式
     */
    @Override
    public MAttributeRecord setNormalize(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.NORMALIZE</code>. 「normalize」- 表达式
     */
    @Override
    public String getNormalize() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.IN_COMPONENT</code>. 「inComponent」- 写入插件
     */
    @Override
    public MAttributeRecord setInComponent(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.IN_COMPONENT</code>. 「inComponent」- 写入插件
     */
    @Override
    public String getInComponent() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.OUT_COMPONENT</code>. 「outComponent」- 读取插件
     */
    @Override
    public MAttributeRecord setOutComponent(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.OUT_COMPONENT</code>. 「outComponent」- 读取插件
     */
    @Override
    public String getOutComponent() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.MODEL_ID</code>. 「modelId」- 关联的模型ID
     */
    @Override
    public MAttributeRecord setModelId(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.MODEL_ID</code>. 「modelId」- 关联的模型ID
     */
    @Override
    public String getModelId() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.COMMENTS</code>. 「comments」- 当前属性的描述信息
     */
    @Override
    public MAttributeRecord setComments(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.COMMENTS</code>. 「comments」- 当前属性的描述信息
     */
    @Override
    public String getComments() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.IS_SYNC_IN</code>. 「isSyncIn」- 是否同步读
     */
    @Override
    public MAttributeRecord setIsSyncIn(Boolean value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.IS_SYNC_IN</code>. 「isSyncIn」- 是否同步读
     */
    @Override
    public Boolean getIsSyncIn() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.IS_SYNC_OUT</code>. 「isSyncOut」- 是否同步写
     */
    @Override
    public MAttributeRecord setIsSyncOut(Boolean value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.IS_SYNC_OUT</code>. 「isSyncOut」- 是否同步写
     */
    @Override
    public Boolean getIsSyncOut() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.IS_LOCK</code>. 「isLock」- 是否锁定，锁定属性不可删除
     */
    @Override
    public MAttributeRecord setIsLock(Boolean value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.IS_LOCK</code>. 「isLock」- 是否锁定，锁定属性不可删除
     */
    @Override
    public Boolean getIsLock() {
        return (Boolean) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.IS_TRACK</code>. 「isTrack」- 是否实现历史记录，如果是 isTrack 那么启用 ACTIVITY 的变更记录，对应 ITEM
     */
    @Override
    public MAttributeRecord setIsTrack(Boolean value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.IS_TRACK</code>. 「isTrack」- 是否实现历史记录，如果是 isTrack 那么启用 ACTIVITY 的变更记录，对应 ITEM
     */
    @Override
    public Boolean getIsTrack() {
        return (Boolean) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public MAttributeRecord setSigma(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public MAttributeRecord setLanguage(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(17);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public MAttributeRecord setActive(Boolean value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(18);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public MAttributeRecord setMetadata(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return (String) get(19);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public MAttributeRecord setCreatedAt(LocalDateTime value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(20);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public MAttributeRecord setCreatedBy(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(21);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public MAttributeRecord setUpdatedAt(LocalDateTime value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(22);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public MAttributeRecord setUpdatedBy(String value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(23);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IMAttribute from) {
        setKey(from.getKey());
        setName(from.getName());
        setAlias(from.getAlias());
        setType(from.getType());
        setSource(from.getSource());
        setSourceField(from.getSourceField());
        setExpression(from.getExpression());
        setNormalize(from.getNormalize());
        setInComponent(from.getInComponent());
        setOutComponent(from.getOutComponent());
        setModelId(from.getModelId());
        setComments(from.getComments());
        setIsSyncIn(from.getIsSyncIn());
        setIsSyncOut(from.getIsSyncOut());
        setIsLock(from.getIsLock());
        setIsTrack(from.getIsTrack());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setActive(from.getActive());
        setMetadata(from.getMetadata());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IMAttribute> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MAttributeRecord
     */
    public MAttributeRecord() {
        super(MAttribute.M_ATTRIBUTE);
    }

    /**
     * Create a detached, initialised MAttributeRecord
     */
    public MAttributeRecord(String key, String name, String alias, String type, String source, String sourceField, String expression, String normalize, String inComponent, String outComponent, String modelId, String comments, Boolean isSyncIn, Boolean isSyncOut, Boolean isLock, Boolean isTrack, String sigma, String language, Boolean active, String metadata, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(MAttribute.M_ATTRIBUTE);

        set(0, key);
        set(1, name);
        set(2, alias);
        set(3, type);
        set(4, source);
        set(5, sourceField);
        set(6, expression);
        set(7, normalize);
        set(8, inComponent);
        set(9, outComponent);
        set(10, modelId);
        set(11, comments);
        set(12, isSyncIn);
        set(13, isSyncOut);
        set(14, isLock);
        set(15, isTrack);
        set(16, sigma);
        set(17, language);
        set(18, active);
        set(19, metadata);
        set(20, createdAt);
        set(21, createdBy);
        set(22, updatedAt);
        set(23, updatedBy);
    }
}
