package za.ac.nwu.ac.domain.dto;

import za.ac.nwu.ac.domain.persistence.Members;

import java.io.Serializable;

public class MembersDto implements Serializable {
    private static final long serialVersionUID = 6018167025144839217L;

    private Members member_Id;
    private String m_Name;
    private String m_LastName;
    private String balance;



}
