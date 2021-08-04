package jakarta.enterprise.lang.model.declarations;

import jakarta.enterprise.lang.model.types.Type;

/**
 * Provides read-only information about a method parameter.
 */
public interface ParameterInfo extends DeclarationInfo {
    /**
     * Returns the name of this parameter, if it is known. Method parameter names may not always be known,
     * in which case a synthetic name of the form {@code argN}, where {@code N} is zero-based parameter position
     * in the method declaration, is returned.
     *
     * @return the name of this parameter, or a synthetic name, never {@code null}
     */
    String name();

    /**
     * Returns the {@link Type type} of this parameter.
     *
     * @return the type of this parameter, never {@code null}
     */
    Type type();

    /**
     * Returns the {@link MethodInfo method} that declares this parameter.
     *
     * @return the method that declares this parameter, never {@code null}
     */
    MethodInfo declaringMethod();

    // ---

    @Override
    default Kind kind() {
        return Kind.PARAMETER;
    }

    @Override
    default ParameterInfo asParameter() {
        return this;
    }
}
