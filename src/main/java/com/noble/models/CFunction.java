package com.noble.models;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Objects;

public final class CFunction {

    private final int argPosIndex;
    private final String name;
    private final String position;
    private final String enclFunctionName;
    private final Node enclFunctionNode;
    private final ArrayList<ArgumentNamePos> funcArgs;

    public CFunction(String name, String position, int argPosIndex, String enclFunctionName, Node enclFunctionNode) {
        this.name = name;
        this.position = position;
        this.argPosIndex = argPosIndex;
        this.enclFunctionName = enclFunctionName;
        this.enclFunctionNode = enclFunctionNode;
        this.funcArgs = null;
    }

    public CFunction(String name, String position, int argPosIndex, String enclFunctionName, Node enclFunctionNode,
                     ArrayList<ArgumentNamePos> funcArgs) {
        this.name = name;
        this.position = position;
        this.argPosIndex = argPosIndex;
        this.enclFunctionName = enclFunctionName;
        this.enclFunctionNode = enclFunctionNode;
        this.funcArgs = funcArgs;
    }

    public CFunction(int argPosIndex, String enclFunctionName, Node enclFunctionNode) {
        this.argPosIndex = argPosIndex;
        this.enclFunctionName = enclFunctionName;
        this.enclFunctionNode = enclFunctionNode;
        this.name = null;
        this.position = null;
        this.funcArgs = null;
    }

    public Node getEnclFunctionNode() {
        return enclFunctionNode;
    }

    public String getEnclFunctionName() {
        return enclFunctionName;
    }

    public int getArgPosIndex() {
        return argPosIndex;
    }

    public ArrayList<ArgumentNamePos> getFuncArgs() {
        return funcArgs;
    }

    public String getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof CFunction)) {
            return false;
        }
        CFunction other = (CFunction) obj;
        assert this.name != null;
        if (!this.name.equals(other.name)) {
            return false;
        }
        assert this.position != null;
        return this.position.equals(other.position) &&
                this.argPosIndex == other.argPosIndex && this.enclFunctionName.equals(other.enclFunctionName) &&
                this.enclFunctionNode == other.enclFunctionNode;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Objects.requireNonNull(this.name).hashCode();
        result = 31 * result + Objects.requireNonNull(this.position).hashCode();
        result = 31 * result + this.enclFunctionName.hashCode();
        return result;
    }
}
