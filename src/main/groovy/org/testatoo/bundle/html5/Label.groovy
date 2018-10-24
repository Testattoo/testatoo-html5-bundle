package org.testatoo.bundle.html5

import org.testatoo.core.CssIdentifier

import static org.testatoo.core.Testatoo.getConfig

/**
 * @author David Avenante (d.avenante@gmail.com)
 */
@CssIdentifier('label')
class Label extends org.testatoo.core.component.Label {
    @Override
    String text() {
        config.evaluator.eval(id(), "it.text()")
    }
}
