package snacks;

import java.util.Objects;

public class Nokia3310 {
    public String mainMenu(){
        return "\n\n=================================== MAIN MENU =================================== \n\n" +
                "1 - Phone book\n" +
                "2 - Messages\n" +
                "3 - Chat\n" +
                "4 - Call register\n" +
                "5 - Tones\n" +
                "6 - Settings\n";
    }

    public String closeOrGoBack(String choice){
        return Objects.equals(choice, "close") ? "99 - Close app" : "99 - Go back\n";
    }

    public String phoneBookMenu(){
        return "\n\n=================================== PHONE BOOK ===================================\n\n" +
                "1 - Search\n" +
                "2 - Service Nos.\n" +
                "3 - Add name\n" +
                "4 - Erase\n" +
                "5 - Edit\n" +
                "6 - Assign tone\n" +
                "7 - Send b'card\n" +
                "8 - Options\n" +
                "9 - Speed dials\n" +
                "10 - Voice tags\n";
    }

    public String phoneBookOptionsMenu(){
        return "\n\n=================================== PHONE BOOK > OPTIONS ===================================\n\n" +
                "1 - Type of view\n" +
                "2 - Memory status\n";
    }

    public String messagesMenu(){
        return "\n\n=================================== MESSAGES ===================================\n\n" +
                "1 - Write messages\n" +
                "2 - Inbox\n" +
                "3 - Outbox\n" +
                "4 - Picture messages\n" +
                "5 - Templates\n" +
                "6 - Smileys\n" +
                "7 - Message settings\n" +
                "8 - Info service\n" +
                "9 - Voice mailbox number\n" +
                "10 - Service command editor\n";
    }

    public String messageSettingsMenu(){
        return "\n\n=================================== MESSAGES > SETTINGS ===================================\n\n" +
                "1 - Set 1\n" +
                "2 - Common\n";
    }

    public String messageSettingsSetMenu(){
        return "\n\n=================================== MESSAGES > SETTINGS > SET ===================================\n\n" +
                "1 - Message center number\n" +
                "2 - Message sent as\n" +
                "3 - Message validity\n";
    }

    public String messageSettingsCommonMenu(){
        return "\n\n=================================== MESSAGES > SETTINGS > COMMON ===================================\n\n" +
                "1 - Delivery reports\n" +
                "2 - Reply via same center\n" +
                "3 - Character support\n" +
                "4 - Info service" +
                "5 - Voice mailbox number" +
                "6 - Service command editor\n";
    }

    public String chatMenu(){
        return "\n\n=================================== CHAT ===================================\n\n";
    }

    public String callRegisterMenu(){
        return "\n\n=================================== CALL REGISTER ===================================\n\n" +
                "1 - Missed calls\n" +
                "2 - Received calls\n" +
                "3 - Dialled numbers\n" +
                "4 - Erase recent call lists\n" +
                "5 - Show call duration\n" +
                "6 - Show call costs\n" +
                "7 - Call cost settings\n" +
                "8 - Prepaid credit\n";
    }

    public String callRegisterDuration(){
        return "\n\n=================================== CALL REGISTER > SHOW CALL DURATION ===================================\n\n" +
                "1 - Last call duration\n" +
                "2 - All calls' duration\n" +
                "3 - Received calls' duration\n" +
                "4 - Dialled calls' duration\n" +
                "5 - Clear timers\n";
    }

    public String callRegisterCostsMenu(){
        return "\n\n=================================== CALL REGISTER > SHOW CALL COSTS ===================================\n\n" +
                "1 - Last call cost\n" +
                "2 - All calls' cost\n" +
                "3 - Clear counters\n";
    }

    public String callRegisterCostSettings(){
        return "\n\n =================================== CALL REGISTER > CALL COST SETTINGS ===================================\n\n" +
                "1 - Call cost limit\n" +
                "2 - Show costs in\n";
    }
}
