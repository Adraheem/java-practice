package snacks;

import java.util.Objects;

public class Nokia3310 {

    public String closeOrGoBack(String choice){
        return Objects.equals(choice, "close") ? "\n99 - Close app" : "\n99 - Go back\n";
    }

    public String generateHeader(String title){
        return "\n\n================== " + title + " ==================\n\n";
    }

    public String mainMenu(){
        return generateHeader("MAIN MENU") +
                "1 - Phone book ⚜️\n" +
                "2 - Messages ⚜️\n" +
                "3 - Chat ⚜️\n" +
                "4 - Call register ⚜️\n" +
                "5 - Tones ⚜️\n" +
                "6 - Settings\n" +
                "7 - Call divert\n" +
                "8 - Games\n" +
                "9 - Calculator\n" +
                "10 - Reminders\n" +
                "11 - Clock ⚜️\n" +
                "12 - Profiles\n" +
                "13 - SIM services" +
                closeOrGoBack("close");
    }

    public String phoneBookMenu(){
        return generateHeader("PHONE BOOK") +
                "1 - Search\n" +
                "2 - Service Nos.\n" +
                "3 - Add name\n" +
                "4 - Erase\n" +
                "5 - Edit\n" +
                "6 - Assign tone\n" +
                "7 - Send b'card\n" +
                "8 - Options ⚜️\n" +
                "9 - Speed dials\n" +
                "10 - Voice tags\n" +
                closeOrGoBack("");
    }

    public String phoneBookOptionsMenu(){
        return generateHeader("PHONE BOOK > OPTIONS") +
                "1 - Type of view\n" +
                "2 - Memory status\n" +
                closeOrGoBack("");
    }

    public String messagesMenu(){
        return generateHeader("MESSAGES") +
                "1 - Write messages\n" +
                "2 - Inbox\n" +
                "3 - Outbox\n" +
                "4 - Picture messages\n" +
                "5 - Templates\n" +
                "6 - Smileys\n" +
                "7 - Message settings ⚜️\n" +
                "8 - Info service\n" +
                "9 - Voice mailbox number\n" +
                "10 - Service command editor\n" +
                closeOrGoBack("");
    }

    public String messageSettingsMenu(){
        return generateHeader("MESSAGES > SETTINGS") +
                "1 - Set 1 ⚜️\n" +
                "2 - Common ⚜️\n" +
                closeOrGoBack("");
    }

    public String messageSettingsSetMenu(){
        return generateHeader("MESSAGES > SETTINGS > SET") +
                "1 - Message center number\n" +
                "2 - Message sent as\n" +
                "3 - Message validity\n" +
                closeOrGoBack("");
    }

    public String messageSettingsCommonMenu(){
        return generateHeader("MESSAGES > SETTINGS > COMMON") +
                "1 - Delivery reports\n" +
                "2 - Reply via same center\n" +
                "3 - Character support\n" +
                "4 - Info service\n" +
                "5 - Voice mailbox number\n" +
                "6 - Service command editor\n" +
                closeOrGoBack("");
    }

    public String chatMenu(){
        return generateHeader("CHAT") + closeOrGoBack("");
    }

    public String callRegisterMenu(){
        return generateHeader("CALL REGISTER") +
                "1 - Missed calls\n" +
                "2 - Received calls\n" +
                "3 - Dialled numbers\n" +
                "4 - Erase recent call lists\n" +
                "5 - Show call duration ⚜️\n" +
                "6 - Show call costs ⚜️\n" +
                "7 - Call cost settings ⚜️\n" +
                "8 - Prepaid credit\n" +
                closeOrGoBack("");
    }

    public String callRegisterDuration(){
        return generateHeader("CALL REGISTER > SHOW CALL DURATION") +
                "1 - Last call duration\n" +
                "2 - All calls' duration\n" +
                "3 - Received calls' duration\n" +
                "4 - Dialled calls' duration\n" +
                "5 - Clear timers\n" +
                closeOrGoBack("");
    }

    public String callRegisterCostsMenu(){
        return generateHeader("CALL REGISTER > SHOW CALL COSTS") +
                "1 - Last call cost\n" +
                "2 - All calls' cost\n" +
                "3 - Clear counters\n" +
                closeOrGoBack("");
    }

    public String callRegisterCostSettings(){
        return generateHeader("CALL REGISTER > CALL COST SETTINGS") +
                "1 - Call cost limit\n" +
                "2 - Show costs in\n" +
                closeOrGoBack("");
    }

    public String tonesMenu(){
        return generateHeader("TONES") +
                "1 - Ringing tone\n" +
                "2 - Ringing volume\n" +
                "3 - Incoming call alert\n" +
                "4 - Composer\n" +
                "5 - Message alert tone\n" +
                "6 - Keypad tones\n" +
                "7 - Warning and game tones\n" +
                "8 - Vibrating alert\n" +
                "9 - Screensaver" +
                closeOrGoBack("");
    }

    public String settingsMenu(){
        return generateHeader("SETTINGS") +
                "1 - Call settings ⚜️\n" +
                "2 - Phone settings ⚜️\n" +
                "3 - Security settings ⚜️\n" +
                "4 - Restore factory settings\n" +
                closeOrGoBack("");
    }

    public String settingsCallMenu(){
        return generateHeader("SETTINGS > CALL SETTINGS") +
                "1 - Automatic redial\n" +
                "2 - Speed dialing\n" +
                "3 - Call waiting options\n" +
                "4 - Own number settings\n" +
                "5 - Phone line in use\n" +
                "6 - Automatic answer\n" +
                closeOrGoBack("");
    }

    public String settingsPhoneMenu(){
        return generateHeader("SETTINGS > PHONE SETTINGS") +
                "1 - Language\n" +
                "2 - Cell info display\n" +
                "3 - Welcome note\n" +
                "4 - Network selection\n" +
                "5 - Lights\n" +
                "6 - Confirm SIM service actions\n" +
                closeOrGoBack("");
    }

    public String settingsSecurityMenu(){
        return generateHeader("SETTINGS > SECURITY SETTINGS") +
                "1 - PIN code request\n" +
                "2 - Call barring service\n" +
                "3 - Fixed dialling\n" +
                "4 - Closed user group\n" +
                "5 - Phone security\n" +
                "6 - Change access codes\n" +
                closeOrGoBack("");
    }

    public String clockMenu(){
        return generateHeader("CLOCK") +
                "1 - Alarm clock\n" +
                "2 - Clock settings\n" +
                "3 - Date setting\n" +
                "4 - Stopwatch\n" +
                "5 - Countdown timer\n" +
                "6 - Auto update of date and time\n" +
                closeOrGoBack("");
    }
}
