/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables;


import cn.vertxup.ambient.domain.Db;
import cn.vertxup.ambient.domain.Indexes;
import cn.vertxup.ambient.domain.Keys;
import cn.vertxup.ambient.domain.tables.records.XMenuRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


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
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class XMenu extends TableImpl<XMenuRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.X_MENU</code>
     */
    public static final XMenu X_MENU = new XMenu();
    private static final long serialVersionUID = 2106688458;
    /**
     * The column <code>DB_ETERNAL.X_MENU.KEY</code>. 「key」- 菜单主键
     */
    public final TableField<XMenuRecord, String> KEY = createField("KEY", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 菜单主键");
    /**
     * The column <code>DB_ETERNAL.X_MENU.NAME</code>. 「name」- 菜单名称
     */
    public final TableField<XMenuRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「name」- 菜单名称");
    /**
     * The column <code>DB_ETERNAL.X_MENU.ICON</code>. 「icon」- 菜单使用的icon
     */
    public final TableField<XMenuRecord, String> ICON = createField("ICON", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「icon」- 菜单使用的icon");
    /**
     * The column <code>DB_ETERNAL.X_MENU.TEXT</code>. 「text」- 菜单显示文字
     */
    public final TableField<XMenuRecord, String> TEXT = createField("TEXT", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「text」- 菜单显示文字");
    /**
     * The column <code>DB_ETERNAL.X_MENU.URI</code>. 「uri」- 菜单地址（不包含应用的path）
     */
    public final TableField<XMenuRecord, String> URI = createField("URI", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「uri」- 菜单地址（不包含应用的path）");
    /**
     * The column <code>DB_ETERNAL.X_MENU.TYPE</code>. 「type」- 菜单类型
     */
    public final TableField<XMenuRecord, String> TYPE = createField("TYPE", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「type」- 菜单类型");
    /**
     * The column <code>DB_ETERNAL.X_MENU.ORDER</code>. 「order」- 菜单排序
     */
    public final TableField<XMenuRecord, Long> ORDER = createField("ORDER", org.jooq.impl.SQLDataType.BIGINT, this, "「order」- 菜单排序");
    /**
     * The column <code>DB_ETERNAL.X_MENU.LEVEL</code>. 「level」- 菜单层级
     */
    public final TableField<XMenuRecord, Long> LEVEL = createField("LEVEL", org.jooq.impl.SQLDataType.BIGINT, this, "「level」- 菜单层级");
    /**
     * The column <code>DB_ETERNAL.X_MENU.PARENT_ID</code>. 「parentId」- 菜单父ID
     */
    public final TableField<XMenuRecord, String> PARENT_ID = createField("PARENT_ID", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「parentId」- 菜单父ID");
    /**
     * The column <code>DB_ETERNAL.X_MENU.APP_ID</code>. 「appId」- 应用程序ID
     */
    public final TableField<XMenuRecord, String> APP_ID = createField("APP_ID", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「appId」- 应用程序ID");
    /**
     * The column <code>DB_ETERNAL.X_MENU.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<XMenuRecord, Boolean> ACTIVE = createField("ACTIVE", org.jooq.impl.SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>DB_ETERNAL.X_MENU.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<XMenuRecord, String> SIGMA = createField("SIGMA", org.jooq.impl.SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");
    /**
     * The column <code>DB_ETERNAL.X_MENU.METADATA</code>. 「metadata」- 附加配置
     */
    public final TableField<XMenuRecord, String> METADATA = createField("METADATA", org.jooq.impl.SQLDataType.CLOB, this, "「metadata」- 附加配置");
    /**
     * The column <code>DB_ETERNAL.X_MENU.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<XMenuRecord, String> LANGUAGE = createField("LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR(8), this, "「language」- 使用的语言");
    /**
     * The column <code>DB_ETERNAL.X_MENU.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<XMenuRecord, LocalDateTime> CREATED_AT = createField("CREATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「createdAt」- 创建时间");
    /**
     * The column <code>DB_ETERNAL.X_MENU.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<XMenuRecord, String> CREATED_BY = createField("CREATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>DB_ETERNAL.X_MENU.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<XMenuRecord, LocalDateTime> UPDATED_AT = createField("UPDATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「updatedAt」- 更新时间");
    /**
     * The column <code>DB_ETERNAL.X_MENU.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<XMenuRecord, String> UPDATED_BY = createField("UPDATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    /**
     * Create a <code>DB_ETERNAL.X_MENU</code> table reference
     */
    public XMenu() {
        this(DSL.name("X_MENU"), null);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.X_MENU</code> table reference
     */
    public XMenu(String alias) {
        this(DSL.name(alias), X_MENU);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.X_MENU</code> table reference
     */
    public XMenu(Name alias) {
        this(alias, X_MENU);
    }

    private XMenu(Name alias, Table<XMenuRecord> aliased) {
        this(alias, aliased, null);
    }

    private XMenu(Name alias, Table<XMenuRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<XMenuRecord> getRecordType() {
        return XMenuRecord.class;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Db.DB_ETERNAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.X_MENU_NAME, Indexes.X_MENU_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<XMenuRecord> getPrimaryKey() {
        return Keys.KEY_X_MENU_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<XMenuRecord>> getKeys() {
        return Arrays.<UniqueKey<XMenuRecord>>asList(Keys.KEY_X_MENU_PRIMARY, Keys.KEY_X_MENU_NAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XMenu as(String alias) {
        return new XMenu(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XMenu as(Name alias) {
        return new XMenu(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public XMenu rename(String name) {
        return new XMenu(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public XMenu rename(Name name) {
        return new XMenu(name, null);
    }
}