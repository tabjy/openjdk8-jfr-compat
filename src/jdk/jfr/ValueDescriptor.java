package jdk.jfr;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import jdk.jfr.internal.AnnotationConstruct;
import jdk.jfr.internal.Type;
import jdk.jfr.internal.Utils;

public final class ValueDescriptor {

    private final AnnotationConstruct annotationConstruct;
    private final Type type;
    private final String name;
    private final boolean isArray;
    private final boolean constantPool;
    private final String javaFieldName;

    // package private, invoked by jdk.internal.
    ValueDescriptor(Type type, String name, List<AnnotationElement> annotations, int dimension, boolean constantPool, String fieldName) {
        }

    public ValueDescriptor(Class<?> type, String name) {
    }

    public ValueDescriptor(Class<?> type, String name, List<AnnotationElement> annotations) {
    }

    ValueDescriptor(Class<?> type, String name, List<AnnotationElement> annotations, boolean allowArray) {
    }

    public String getLabel() {
        return null;
    }

    public String getName() {
        return null;
    }

    public String getDescription() {
        return null;
    }

    public String getContentType() {
        return null;
    }

    public String getTypeName() {
    	return null;
    }

    public long getTypeId() {
        return 0;
    }

    public boolean isArray() {
        return false;
    }

    public <A extends Annotation> A getAnnotation(Class<A> annotationType) {
    	return null;
    }

    public List<AnnotationElement> getAnnotationElements() {
        return null;
    }

    public List<ValueDescriptor> getFields() {
        return null;
    }

    Type getType() {
        return null;
    }

    void setAnnotations(List<AnnotationElement> anno) {
    }

    boolean isConstantPool() {
        return false;
    }

    String getJavaFieldName() {
        return null;
    }

    boolean isUnsigned() {
        return false;
    }

}
