package com.search.mapper;

import com.search.map.OrganizationsMap;
import com.search.map.TicketsMap;
import com.search.map.UsersMap;
import com.search.model.Organizations;
import com.search.model.Tickets;
import com.search.model.Users;

import java.util.HashMap;
import java.util.List;

public class SearchMapper {
  
  public static OrganizationsMap mapOrganizations(Organizations[] organizations) {
    
    OrganizationsMap organizationsMap = new OrganizationsMap();
    
    if (organizations != null && organizations.length > 0) {
      HashMap<Integer, Organizations> idMap = new HashMap<>();
      
      HashMap<String, Integer> urlMap = new HashMap<>();
      
      HashMap<String, Integer> externalIdMap = new HashMap<>();
      
      HashMap<String, Integer> nameMap = new HashMap<>();
      
      HashMap<List<String>, Integer> domainNamesMap = new HashMap<>();
      
      HashMap<String, Integer> createdAtMap = new HashMap<>();
      
      HashMap<String, Integer> detailsMap = new HashMap<>();
      
      HashMap<Boolean, Integer> sharedTicketsMap = new HashMap<>();
      
      HashMap<List<String>, Integer> tagsMap = new HashMap<>();
      
      for (Organizations organization : organizations) {
        idMap.put(organization.getId(), organization);
        urlMap.put(organization.getUrl(), organization.getId());
        externalIdMap.put(organization.getExternalId(), organization.getId());
        nameMap.put(organization.getName(), organization.getId());
        domainNamesMap.put(organization.getDomainNames(), organization.getId());
        createdAtMap.put(organization.getCreatedAt(), organization.getId());
        detailsMap.put(organization.getDetails(), organization.getId());
        sharedTicketsMap.put(organization.isSharedTickets(), organization.getId());
        tagsMap.put(organization.getTags(), organization.getId());
      }
      organizationsMap.setCreatedAtMap(createdAtMap);
      organizationsMap.setDetailsMap(detailsMap);
      organizationsMap.setDomainNamesMap(domainNamesMap);
      organizationsMap.setExternalIdMap(externalIdMap);
      organizationsMap.setIdMap(idMap);
      organizationsMap.setNameMap(nameMap);
      organizationsMap.setSharedTicketsMap(sharedTicketsMap);
      organizationsMap.setTagsMap(tagsMap);
      organizationsMap.setUrlMap(urlMap);
    }
    
    return organizationsMap;
    
  }
  
  public static UsersMap mapUsers(Users[] users) {
    
    UsersMap usersMap = new UsersMap();
    
    if (users != null && users.length > 0) {
      HashMap<String, Users> idMap = new HashMap<>();
      
      HashMap<String, String> urlMap = new HashMap<>();
      
      HashMap<String, String> externalIdMap = new HashMap<>();
      
      HashMap<String, String> nameMap = new HashMap<>();
      
      HashMap<String, String> aliasMap = new HashMap<>();
      
      HashMap<String, String> createdAtMap = new HashMap<>();
      
      HashMap<Boolean, String> activeMap = new HashMap<>();
      
      HashMap<Boolean, String> verifiedMap = new HashMap<>();
      
      HashMap<Boolean, String> sharedMap = new HashMap<>();
      
      HashMap<String, String> localeMap = new HashMap<>();
      
      HashMap<String, String> timezoneMap = new HashMap<>();
      
      HashMap<String, String> lastLoginAtMap = new HashMap<>();
      
      HashMap<String, String> emailMap = new HashMap<>();
      
      HashMap<String, String> phoneMap = new HashMap<>();
      
      HashMap<String, String> signatureMap = new HashMap<>();
      
      HashMap<Integer, String> organizationIdMap = new HashMap<>();
      
      HashMap<List<String>, String> tagsMap = new HashMap<>();
      
      HashMap<Boolean, String> suspendedMap = new HashMap<>();
      
      HashMap<String, String> roleMap = new HashMap<>();
      
      for (Users user : users) {
        idMap.put(user.getId(), user);
        urlMap.put(user.getUrl(), user.getId());
        externalIdMap.put(user.getExternalId(), user.getId());
        nameMap.put(user.getName(), user.getId());
        aliasMap.put(user.getAlias(), user.getId());
        createdAtMap.put(user.getCreatedAt(), user.getId());
        activeMap.put(user.isActive(), user.getId());
        verifiedMap.put(user.isVerified(), user.getId());
        sharedMap.put(user.isShared(), user.getId());
        localeMap.put(user.isLocale(), user.getId());
        timezoneMap.put(user.isTimezone(), user.getId());
        lastLoginAtMap.put(user.isLastLoginAt(), user.getId());
        emailMap.put(user.isEmail(), user.getId());
        phoneMap.put(user.isPhone(), user.getId());
        signatureMap.put(user.isSignature(), user.getId());
        organizationIdMap.put(user.getOrganization_id(), user.getId());
        tagsMap.put(user.getTags(), user.getId());
        suspendedMap.put(user.isSuspended(), user.getId());
        roleMap.put(user.getRole(), user.getId());
      }
      
      usersMap.setActiveMap(activeMap);
      usersMap.setAliasMap(aliasMap);
      usersMap.setCreatedAtMap(createdAtMap);
      usersMap.setEmailMap(emailMap);
      usersMap.setExternalIdMap(externalIdMap);
      usersMap.setIdMap(idMap);
      usersMap.setLastLoginAtMap(lastLoginAtMap);
      usersMap.setLocaleMap(localeMap);
      usersMap.setNameMap(nameMap);
      usersMap.setOrganizationIdMap(organizationIdMap);
      usersMap.setPhoneMap(phoneMap);
      usersMap.setRoleMap(roleMap);
      usersMap.setSharedMap(sharedMap);
      usersMap.setSignatureMap(signatureMap);
      usersMap.setSuspendedMap(suspendedMap);
      usersMap.setTagsMap(tagsMap);
      usersMap.setTimezoneMap(timezoneMap);
      usersMap.setUrlMap(urlMap);
      usersMap.setVerifiedMap(verifiedMap);
    }
    return usersMap;
    
  }
  
  public static TicketsMap mapTickets(Tickets[] tickets) {
    
    TicketsMap ticketsMap = new TicketsMap();
    if (tickets != null && tickets.length > 0) {
      
      HashMap<String, Tickets> idMap = new HashMap<>();
      
      HashMap<String, String> urlMap = new HashMap<>();
      
      HashMap<String, String> externalIdMap = new HashMap<>();
      
      HashMap<String, String> createdAtMap = new HashMap<>();
      
      HashMap<String, String> typeMap = new HashMap<>();
      
      HashMap<String, String> subjectMap = new HashMap<>();
      
      HashMap<String, String> descriptionMap = new HashMap<>();
      
      HashMap<String, String> priorityMap = new HashMap<>();
      
      HashMap<String, String> statusMap = new HashMap<>();
      
      HashMap<Integer, String> submitterIdMap = new HashMap<>();
      
      HashMap<Integer, String> assigneeIdMap = new HashMap<>();
      
      HashMap<Integer, String> organizationIdMap = new HashMap<>();
      
      HashMap<List<String>, String> tagsMap = new HashMap<>();
      
      HashMap<Boolean, String> hasIncidentsMap = new HashMap<>();
      
      HashMap<String, String> dueAtMap = new HashMap<>();
      
      HashMap<String, String> viaMap = new HashMap<>();
      
      for (Tickets ticket : tickets) {
        idMap.put(ticket.getId(), ticket);
        urlMap.put(ticket.getUrl(), ticket.getId());
        externalIdMap.put(ticket.getExternalId(), ticket.getId());
        createdAtMap.put(ticket.getCreatedAt(), ticket.getId());
        typeMap.put(ticket.getType(), ticket.getId());
        subjectMap.put(ticket.getSubject(), ticket.getId());
        descriptionMap.put(ticket.getDescription(), ticket.getId());
        priorityMap.put(ticket.getPriority(), ticket.getId());
        statusMap.put(ticket.getStatus(), ticket.getId());
        submitterIdMap.put(ticket.getSubmitterId(), ticket.getId());
        assigneeIdMap.put(ticket.getAssigneeId(), ticket.getId());
        tagsMap.put(ticket.getTags(), ticket.getId());
        hasIncidentsMap.put(ticket.isHasIncidents(), ticket.getId());
        dueAtMap.put(ticket.getDueAt(), ticket.getId());
        viaMap.put(ticket.getVia(), ticket.getId());
        
      }
      
      ticketsMap.setAssigneeIdMap(assigneeIdMap);
      ticketsMap.setCreatedAtMap(createdAtMap);
      ticketsMap.setDescriptionMap(descriptionMap);
      ticketsMap.setDueAtMap(dueAtMap);
      ticketsMap.setExternalIdMap(externalIdMap);
      ticketsMap.setHasIncidentsMap(hasIncidentsMap);
      ticketsMap.setIdMap(idMap);
      ticketsMap.setOrganizationIdMap(organizationIdMap);
      ticketsMap.setPriorityMap(priorityMap);
      ticketsMap.setStatusMap(statusMap);
      ticketsMap.setSubjectMap(subjectMap);
      ticketsMap.setSubmitterIdMap(submitterIdMap);
      ticketsMap.setTagsMap(tagsMap);
      ticketsMap.setUrlMap(urlMap);
      ticketsMap.setTypeMap(typeMap);
      ticketsMap.setViaMap(viaMap);
    }
    return ticketsMap;
  }
}
