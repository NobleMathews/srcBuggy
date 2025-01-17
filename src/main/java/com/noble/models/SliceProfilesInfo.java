package com.noble.models;

import org.w3c.dom.Node;

import java.util.Hashtable;
import java.util.List;

public class SliceProfilesInfo {
    public final Hashtable<String, SliceProfile> sliceProfiles;
    public final Hashtable<FunctionNamePos, Node> functionNodes;
    public final Hashtable<String, List<FunctionNamePos>> functionDeclMap;
    public final Node unitNode;

    public SliceProfilesInfo(Hashtable<String, SliceProfile> sliceProfiles,
                                Hashtable<FunctionNamePos, Node> functionNodes,
                                Hashtable<String, List<FunctionNamePos>> functionDeclMap,
                                Node unitNode) {
        this.sliceProfiles = sliceProfiles;
        this.functionNodes = functionNodes;
        this.functionDeclMap = functionDeclMap;
        this.unitNode = unitNode;
    }


}

