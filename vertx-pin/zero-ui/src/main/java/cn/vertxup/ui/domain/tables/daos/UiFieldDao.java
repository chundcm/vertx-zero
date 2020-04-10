/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.ui.domain.tables.daos;


import cn.vertxup.ui.domain.tables.UiField;
import cn.vertxup.ui.domain.tables.records.UiFieldRecord;

import io.github.jklingsporn.vertx.jooq.future.VertxDAO;

import java.time.LocalDateTime;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


import java.util.concurrent.CompletableFuture;
import io.github.jklingsporn.vertx.jooq.future.util.FutureTool;
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
public class UiFieldDao extends DAOImpl<UiFieldRecord, cn.vertxup.ui.domain.tables.pojos.UiField, String> implements VertxDAO<cn.vertxup.ui.domain.tables.records.UiFieldRecord,cn.vertxup.ui.domain.tables.pojos.UiField,java.lang.String> {

    /**
     * Create a new UiFieldDao without any configuration
     */
    public UiFieldDao() {
        super(UiField.UI_FIELD, cn.vertxup.ui.domain.tables.pojos.UiField.class);
    }

    /**
     * Create a new UiFieldDao with an attached configuration
     */
    public UiFieldDao(Configuration configuration) {
        super(UiField.UI_FIELD, cn.vertxup.ui.domain.tables.pojos.UiField.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(cn.vertxup.ui.domain.tables.pojos.UiField object) {
        return object.getKey();
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiField> fetchByKey(String... values) {
        return fetch(UiField.UI_FIELD.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code>
     */
    public cn.vertxup.ui.domain.tables.pojos.UiField fetchOneByKey(String value) {
        return fetchOne(UiField.UI_FIELD.KEY, value);
    }

    /**
     * Fetch records that have <code>X_POINT IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiField> fetchByXPoint(Integer... values) {
        return fetch(UiField.UI_FIELD.X_POINT, values);
    }

    /**
     * Fetch records that have <code>Y_POINT IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiField> fetchByYPoint(Integer... values) {
        return fetch(UiField.UI_FIELD.Y_POINT, values);
    }

    /**
     * Fetch records that have <code>LABEL IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiField> fetchByLabel(String... values) {
        return fetch(UiField.UI_FIELD.LABEL, values);
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiField> fetchByName(String... values) {
        return fetch(UiField.UI_FIELD.NAME, values);
    }

    /**
     * Fetch records that have <code>SPAN IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiField> fetchBySpan(Integer... values) {
        return fetch(UiField.UI_FIELD.SPAN, values);
    }

    /**
     * Fetch records that have <code>HIDDEN IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiField> fetchByHidden(Boolean... values) {
        return fetch(UiField.UI_FIELD.HIDDEN, values);
    }

    /**
     * Fetch records that have <code>RENDER IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiField> fetchByRender(String... values) {
        return fetch(UiField.UI_FIELD.RENDER, values);
    }

    /**
     * Fetch records that have <code>OPTION_JSX IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiField> fetchByOptionJsx(String... values) {
        return fetch(UiField.UI_FIELD.OPTION_JSX, values);
    }

    /**
     * Fetch records that have <code>OPTION_CONFIG IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiField> fetchByOptionConfig(String... values) {
        return fetch(UiField.UI_FIELD.OPTION_CONFIG, values);
    }

    /**
     * Fetch records that have <code>OPTION_ITEM IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiField> fetchByOptionItem(String... values) {
        return fetch(UiField.UI_FIELD.OPTION_ITEM, values);
    }

    /**
     * Fetch records that have <code>RULES IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiField> fetchByRules(String... values) {
        return fetch(UiField.UI_FIELD.RULES, values);
    }

    /**
     * Fetch records that have <code>CONTROL_ID IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiField> fetchByControlId(String... values) {
        return fetch(UiField.UI_FIELD.CONTROL_ID, values);
    }

    /**
     * Fetch records that have <code>ROW_TYPE IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiField> fetchByRowType(String... values) {
        return fetch(UiField.UI_FIELD.ROW_TYPE, values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiField> fetchByActive(Boolean... values) {
        return fetch(UiField.UI_FIELD.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiField> fetchBySigma(String... values) {
        return fetch(UiField.UI_FIELD.SIGMA, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiField> fetchByMetadata(String... values) {
        return fetch(UiField.UI_FIELD.METADATA, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiField> fetchByLanguage(String... values) {
        return fetch(UiField.UI_FIELD.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiField> fetchByCreatedAt(LocalDateTime... values) {
        return fetch(UiField.UI_FIELD.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiField> fetchByCreatedBy(String... values) {
        return fetch(UiField.UI_FIELD.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiField> fetchByUpdatedAt(LocalDateTime... values) {
        return fetch(UiField.UI_FIELD.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiField> fetchByUpdatedBy(String... values) {
        return fetch(UiField.UI_FIELD.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiField>> fetchByKeyAsync(List<String> values) {
        return fetchAsync(UiField.UI_FIELD.KEY,values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code> asynchronously
     */
    public CompletableFuture<cn.vertxup.ui.domain.tables.pojos.UiField> fetchOneByKeyAsync(String value) {
        return FutureTool.executeBlocking(h->h.complete(fetchOneByKey(value)),vertx());
    }

    /**
     * Fetch records that have <code>X_POINT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiField>> fetchByXPointAsync(List<Integer> values) {
        return fetchAsync(UiField.UI_FIELD.X_POINT,values);
    }

    /**
     * Fetch records that have <code>Y_POINT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiField>> fetchByYPointAsync(List<Integer> values) {
        return fetchAsync(UiField.UI_FIELD.Y_POINT,values);
    }

    /**
     * Fetch records that have <code>LABEL IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiField>> fetchByLabelAsync(List<String> values) {
        return fetchAsync(UiField.UI_FIELD.LABEL,values);
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiField>> fetchByNameAsync(List<String> values) {
        return fetchAsync(UiField.UI_FIELD.NAME,values);
    }

    /**
     * Fetch records that have <code>SPAN IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiField>> fetchBySpanAsync(List<Integer> values) {
        return fetchAsync(UiField.UI_FIELD.SPAN,values);
    }

    /**
     * Fetch records that have <code>HIDDEN IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiField>> fetchByHiddenAsync(List<Boolean> values) {
        return fetchAsync(UiField.UI_FIELD.HIDDEN,values);
    }

    /**
     * Fetch records that have <code>RENDER IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiField>> fetchByRenderAsync(List<String> values) {
        return fetchAsync(UiField.UI_FIELD.RENDER,values);
    }

    /**
     * Fetch records that have <code>OPTION_JSX IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiField>> fetchByOptionJsxAsync(List<String> values) {
        return fetchAsync(UiField.UI_FIELD.OPTION_JSX,values);
    }

    /**
     * Fetch records that have <code>OPTION_CONFIG IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiField>> fetchByOptionConfigAsync(List<String> values) {
        return fetchAsync(UiField.UI_FIELD.OPTION_CONFIG,values);
    }

    /**
     * Fetch records that have <code>OPTION_ITEM IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiField>> fetchByOptionItemAsync(List<String> values) {
        return fetchAsync(UiField.UI_FIELD.OPTION_ITEM,values);
    }

    /**
     * Fetch records that have <code>RULES IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiField>> fetchByRulesAsync(List<String> values) {
        return fetchAsync(UiField.UI_FIELD.RULES,values);
    }

    /**
     * Fetch records that have <code>CONTROL_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiField>> fetchByControlIdAsync(List<String> values) {
        return fetchAsync(UiField.UI_FIELD.CONTROL_ID,values);
    }

    /**
     * Fetch records that have <code>ROW_TYPE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiField>> fetchByRowTypeAsync(List<String> values) {
        return fetchAsync(UiField.UI_FIELD.ROW_TYPE,values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiField>> fetchByActiveAsync(List<Boolean> values) {
        return fetchAsync(UiField.UI_FIELD.ACTIVE,values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiField>> fetchBySigmaAsync(List<String> values) {
        return fetchAsync(UiField.UI_FIELD.SIGMA,values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiField>> fetchByMetadataAsync(List<String> values) {
        return fetchAsync(UiField.UI_FIELD.METADATA,values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiField>> fetchByLanguageAsync(List<String> values) {
        return fetchAsync(UiField.UI_FIELD.LANGUAGE,values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiField>> fetchByCreatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(UiField.UI_FIELD.CREATED_AT,values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiField>> fetchByCreatedByAsync(List<String> values) {
        return fetchAsync(UiField.UI_FIELD.CREATED_BY,values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiField>> fetchByUpdatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(UiField.UI_FIELD.UPDATED_AT,values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiField>> fetchByUpdatedByAsync(List<String> values) {
        return fetchAsync(UiField.UI_FIELD.UPDATED_BY,values);
    }

    private io.vertx.core.Vertx vertx;

    @Override
    public void setVertx(io.vertx.core.Vertx vertx) {
        this.vertx = vertx;
    }

    @Override
    public io.vertx.core.Vertx vertx() {
        return this.vertx;
    }

}