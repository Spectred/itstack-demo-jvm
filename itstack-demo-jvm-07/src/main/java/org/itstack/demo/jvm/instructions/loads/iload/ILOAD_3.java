package org.itstack.demo.jvm.instructions.loads.iload;

import org.itstack.demo.jvm.instructions.base.InstructionNoOperands;
import org.itstack.demo.jvm.rtda.Frame;

public class ILOAD_3 extends InstructionNoOperands {

    @Override
    public void execute(Frame frame) {
        int val = frame.localVars().getInt(3);
        frame.operandStack().pushInt(val);
    }
}
