package com.nlebv.application4;

import android.content.Context;
import android.content.Intent;

/**
 * ============================================
 * 项目名称: com.nlebv.app2
 * 创建人: lcw---9530665@qq.com
 * 创建时间:2017/6/30  17:49
 * 更新记录:
 * ===========================================
 */

public class RestartAPPTool {

    public static void restartAPP(Context context, long Delayed){


        Intent intent1=new Intent(context,killSelfService.class);
        intent1.putExtra("PackageName",context.getPackageName());
        intent1.putExtra("Delayed",Delayed);
        context.startService(intent1);
        android.os.Process.killProcess(android.os.Process.myPid());
    }
    public static void restartAPP(Context context){
        restartAPP(context,2000);
    }
}
