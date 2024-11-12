package com.example.stopmadspild.repository;

import com.example.stopmadspild.model.Partner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Repository
public class PartnerRepository{

    @Autowired
    JdbcTemplate jdbcTemplate;

    private RowMapper<Partner> partnerRowMapper = new RowMapper<>() {
        @Override
        public Partner mapRow(ResultSet rs, int rowNum) throws SQLException {
            Partner partner = new Partner();
            partner.setId(rs.getInt("id"));
            partner.setName(rs.getString("name"));
            partner.setEmail(rs.getString("email"));
            partner.setAddress(rs.getString("address"));
            partner.setOpeningHours(rs.getString("opening_hours"));
            partner.setWhoIs(rs.getString("who_is"));
            partner.setHowMuch(rs.getString("how_much"));
            partner.setSinceWhen(rs.getString("since_when"));
            partner.setIconPictureLink(rs.getString("icon_picture_link"));
            partner.setWebsiteLink(rs.getString("website_link"));
            return partner;
        }
    };

    public int save(Partner partner) {
        String sql = "INSERT INTO partner (name, email, address, opening_hours, who_is, how_much, since_when, icon_picture_link, website_link) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql, partner.getName(), partner.getEmail(), partner.getAddress(),
                partner.getOpeningHours(), partner.getWhoIs(), partner.getHowMuch(),
                partner.getSinceWhen(), partner.getIconPictureLink(), partner.getWebsiteLink());
    }

    public int update(Partner partner) {
        String sql = "UPDATE partner SET name = ?, email = ?, address = ?, opening_hours = ?, who_is = ?, " +
                "how_much = ?, since_when = ?, icon_picture_link = ?, website_link = ? WHERE id = ?";
        return jdbcTemplate.update(sql, partner.getName(), partner.getEmail(), partner.getAddress(),
                partner.getOpeningHours(), partner.getWhoIs(), partner.getHowMuch(),
                partner.getSinceWhen(), partner.getIconPictureLink(), partner.getWebsiteLink(), partner.getId());
    }

    public int deleteById(int id) {
        String sql = "DELETE FROM partner WHERE id = ?";
        return jdbcTemplate.update(sql, id);
    }

    public Optional<Partner> findById(int id) {
        String sql = "SELECT * FROM partner WHERE id = ?";
        return jdbcTemplate.query(sql, partnerRowMapper, id).stream().findFirst();
    }

    public List<Partner> findAll() {
        String sql = "SELECT * FROM partner";
        return jdbcTemplate.query(sql, partnerRowMapper);
    }
}