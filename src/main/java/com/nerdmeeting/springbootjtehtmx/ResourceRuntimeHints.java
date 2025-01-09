package com.nerdmeeting.springbootjtehtmx;

import gg.jte.generated.precompiled.JteindexGenerated;
import org.springframework.aot.hint.MemberCategory;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.stereotype.Component;

@Component
public class ResourceRuntimeHints implements RuntimeHintsRegistrar {

    @Override
    public void registerHints(RuntimeHints hints, ClassLoader classLoader) {
        hints.resources()
                .registerPattern("**/*.bin");

        hints.reflection()
                .registerType(
                        JteindexGenerated.class,
                        MemberCategory.INVOKE_DECLARED_CONSTRUCTORS,
                        MemberCategory.INTROSPECT_DECLARED_METHODS);
    }
}
