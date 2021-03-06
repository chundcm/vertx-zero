package io.vertx.up.uca.rs.mime.resolver;

import io.vertx.ext.web.RoutingContext;
import io.vertx.up.atom.Epsilon;
import io.vertx.up.exception.WebException;
import io.vertx.up.log.Annal;
import io.vertx.up.runtime.ZeroSerializer;
import io.vertx.up.uca.rs.mime.Resolver;

/**
 * Json Resolver
 *
 * @param <T>
 */
@SuppressWarnings("unchecked")
public class JsonResolver<T> implements Resolver<T> {

    private static final Annal LOGGER = Annal.get(JsonResolver.class);

    @Override
    public Epsilon<T> resolve(final RoutingContext context,
                              final Epsilon<T> income)
            throws WebException {
        // Json Resolver
        final String content = context.getBodyAsString();
        LOGGER.info("( Resolver ) Income Type: {0}, Content = {1}",
                income.getArgType().getName(), content);
        final Object result = ZeroSerializer.getValue(income.getArgType(), content);
        if (null != result) {
            income.setValue((T) result);
        }
        return income;
    }
}
