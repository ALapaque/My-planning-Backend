/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.18).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package eu.busi.myplanning.api.controllers;

import eu.busi.myplanning.api.models.RoleDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-10-19T20:08:30.189584700+02:00[Europe/Paris]")
@Api(value = "role", description = "the role API")
public interface RoleApi {

    Logger log = LoggerFactory.getLogger(RoleApi.class);

    Optional<ObjectMapper> getObjectMapper();

    Optional<HttpServletRequest> getRequest();

    

    @ApiOperation(value = "", nickname = "deleteRole", notes = "", response = Boolean.class, tags={ "Role API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Boolean.class) })
    @RequestMapping(value = "/role/{id}",
        produces = { "*/*" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Boolean> deleteRole(@ApiParam(value = "",required=true) @PathVariable("id") Long id
);


    @ApiOperation(value = "", nickname = "findRole", notes = "", response = Object.class, tags={ "Role API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Object.class) })
    @RequestMapping(value = "/role/{id}",
        produces = { "*/*" }, 
        method = RequestMethod.GET)
    ResponseEntity<Object> findRole(@ApiParam(value = "",required=true) @PathVariable("id") Long id
);


    @ApiOperation(value = "", nickname = "findRoles", notes = "", response = Object.class, tags={ "Role API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Object.class) })
    @RequestMapping(value = "/role",
        produces = { "*/*" }, 
        method = RequestMethod.GET)
    ResponseEntity<Object> findRoles();


    @ApiOperation(value = "", nickname = "saveRole", notes = "", response = Object.class, tags={ "Role API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = Object.class) })
    @RequestMapping(value = "/role",
        produces = { "*/*" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Object> saveRole(@ApiParam(value = "" ,required=true )  @Valid @RequestBody RoleDTO body
);


    @ApiOperation(value = "", nickname = "updateRole", notes = "", response = Object.class, tags={ "Role API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Object.class) })
    @RequestMapping(value = "/role/{id}",
        produces = { "*/*" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Object> updateRole(@ApiParam(value = "" ,required=true )  @Valid @RequestBody RoleDTO body
,@ApiParam(value = "",required=true) @PathVariable("id") Long id
);

}
