package de.cofinpro.intellij.acfeplugin;

import com.intellij.AbstractBundle;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.PropertyKey;

import java.util.function.Supplier;

public class FormulaEngineBundle extends AbstractBundle {
    @NonNls
    public static final String BUNDLE = "messages.FormulaEngine";

    private static final FormulaEngineBundle INSTANCE = new FormulaEngineBundle();

    private FormulaEngineBundle() {
        super(BUNDLE);
    }

    @NotNull
    public static String message(@NotNull @PropertyKey(resourceBundle = BUNDLE) String key, Object... params) {
        return INSTANCE.getMessage(key, params);
    }

    @NotNull
    public static Supplier<String> lazyMessage(@NotNull @PropertyKey(resourceBundle = BUNDLE) String key, Object... params) {
        return () -> message(key, params);
    }
}
